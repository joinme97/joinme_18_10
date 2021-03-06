package com.sjl.joinme.created_activity_list;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.sjl.joinme.database.JoinMeDB;

public class CreatedActivityListDAO {
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public boolean updateCreatedActivityList(CreatedActivityListDTO dto) {
		boolean flag = false;
		try {
			if (conn == null) {
				conn = JoinMeDB.getConnection();
			}
			String query = "update created_activity_list set tag_id=?, user_id=?,cost=?,"
					+ " activity_name=?, activity_description=?, activity_date=?, status=? where tag_id=" + dto.getActivity_id();
			ps = conn.prepareStatement(query);
			ps.setInt(1, dto.getTag_id());
			ps.setInt(2, dto.getUser_id());
			ps.setInt(3, dto.getCost());
			ps.setString(4, dto.getActivity_name());
			ps.setString(5, dto.getActivity_description());
			ps.setString(6, dto.getActivity_date());
			ps.setString(7, "" + dto.getStatus());
			if (ps.executeUpdate() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			System.out.println("+++Exception in updateCreatedActivityList:" + e);
		} finally {
			ps = null;
			conn = null;
			return flag;
		}
	}

	public boolean deleteActivity(int activity_id) {
		boolean flag = false;
		try {
			if (conn == null) {
				conn = JoinMeDB.getConnection();
			}
			String query = "delete from created_activity_list where activity_id=" + activity_id;
			ps = conn.prepareStatement(query);
			if (ps.executeUpdate() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			System.out.println("+++Exception in deleteCreatedActivityList:" + e);
		} finally {
			ps = null;
			conn = null;
			return flag;
		}
	}

	public CreatedActivityListDTO showActivity(int activity_id) {
		CreatedActivityListDTO dto=null;
		try {
			if (conn==null) {
				conn=JoinMeDB.getConnection();
			}
			String query="select * from created_activity_list where activity_id="+activity_id;
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			if (rs.next()) {
				dto = new CreatedActivityListDTO();
				dto.setActivity_date(rs.getString("activity_date"));
				dto.setActivity_id(rs.getInt("activity_id"));
				dto.setActivity_name(rs.getString("activity_name"));
				dto.setCost(rs.getInt("cost"));
				dto.setCreated_datetime(rs.getString("created_datetime"));
				dto.setActivity_description(rs.getString("getActivity_description"));
				dto.setStatus(rs.getString("status").charAt(0));
				dto.setTag_id(rs.getInt("tag_id"));
				dto.setUser_id(rs.getInt("user_id"));
			}
		} catch (Exception e) {
			System.out.println("+++Exception in showActivity:" + e);
		}finally {
			return dto;
		}
	}

	public ArrayList<CreatedActivityListDTO> getAllCreatedActivityList() {
		ArrayList<CreatedActivityListDTO> al = new ArrayList<>();
		CreatedActivityListDTO dto = null;
		try {
			if (conn == null) {
				conn = JoinMeDB.getConnection();
			}
			String query = "select * from created_activity_list";
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				dto = new CreatedActivityListDTO();
				dto.setActivity_date(rs.getString("activity_date"));
				dto.setActivity_id(rs.getInt("activity_id"));
				dto.setActivity_name(rs.getString("activity_name"));
				dto.setCost(rs.getInt("cost"));
				dto.setCreated_datetime(rs.getString("created_datetime"));
				dto.setActivity_description(rs.getString("getActivity_description"));
				dto.setStatus(rs.getString("status").charAt(0));
				dto.setTag_id(rs.getInt("tag_id"));
				dto.setUser_id(rs.getInt("user_id"));
				al.add(dto);
			}
		} catch (Exception e) {
			System.out.println("+++Exception in getAllCreatedActivityList:" + e);
		} finally {
			if (al.isEmpty()) {
				al = null;
			}
			ps = null;
			rs = null;
			conn = null;
			return al;
		}
	}
	
	public ArrayList<CreatedActivityListDTO> getMyActivities(int user_id) {
		ArrayList<CreatedActivityListDTO> al = new ArrayList<>();
		CreatedActivityListDTO dto = null;
		try {
			if (conn == null) {
				conn = JoinMeDB.getConnection();
			}
			String qurey = "select * from created_activity_list where user_id=" + user_id;
			ps = conn.prepareStatement(qurey);
			rs = ps.executeQuery();
			while (rs.next()) {
				dto = new CreatedActivityListDTO();
				dto.setActivity_date(rs.getString("activity_date"));
				dto.setActivity_id(rs.getInt("activity_id"));
				dto.setActivity_name(rs.getString("activity_name"));
				dto.setCost(rs.getInt("cost"));
				dto.setCreated_datetime(rs.getString("created_datetime"));
				dto.setDescription(rs.getString("description"));
				dto.setStatus(rs.getString("status").charAt(0));
				dto.setTag_id(rs.getInt("tag_id"));
				dto.setUser_id(rs.getInt("user_id"));
				al.add(dto);
			}
		} catch (Exception e) {
			System.out.println("+++Exception in getMyActivities: " + e);
		} finally {
			if (al.isEmpty()) {
				al=null;
			}
			rs=null;
			ps=null;
			conn=null;
			return al;
		}
	}
	
	public LinkedHashMap<Integer, String> searchActivityByTag(int tag_id) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		try {
			if (conn == null) {
				conn = JoinMeDB.getConnection();
			}
			String query = "select activity_id, activity_name from created_activity_list where tag_id=" + tag_id;
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				map.put(rs.getInt("activityid"), rs.getString("activity_name"));
			}
		} catch (Exception e) {
			System.out.println("+++Exception in searchActivityByTag:" + e);
		} finally {
			return map;
		}
	}
}
