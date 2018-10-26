<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Document</title>
  <link rel="stylesheet" href="css/w3.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  <style>
    *{
      margin:0;
      padding:0;
    }
    body {
      background: #333;
      color: #fff; }

    #home-section {
      background: url("img/home.jpg") no-repeat;
      background-size: cover;
      background-attachment: fixed;
      min-height: 700px;
     }
      #home-section .dark-overlay {
        background-color: rgba(0, 0, 0, 0.7);
        min-height: 700px;
      }
      #home-section .home-inner {
        padding-top: 150px;
      }

      #home-section .card-form {
        opacity: 0.8;
      }
      #home-section .fa {
        color: #008ed6;
        background: #fff;
        padding: 4px;
        border-radius: 5px;
        font-size: 30px;
      }
      .navbar {
        border-bottom: #008ed6 3px solid;
        opacity: 0.8; }

        #authors img {
          width:17%;
          margin-top: -130px; }

        #authors .fa {
          font-size: 25px; }

        #authors .card {
          background: #3292a6;
          color: #fff; }
          #authors .card:hover .fa {
            color: #fff; }

  </style>
</head>
<body>
  <nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
    <div class="container">
      <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
        <span class="navbar-toggler-icon"></span>
      </button>

      <a href="index.html" class="w3-bar-item w3-right navbar-brand"><img class="w3-circle" src="img/joinme.jpg" style="width:50px;margin-right:5px;">JOIN ME!</a>

    </div>
  </nav>

  <!-- HOme section -->

  <header id="home-section">
    <div class="dark-overlay">
      <div class="home-inner">
        <!-- HEADINGGG -->
        <h5 class="display-4 text-center" style="margin-bottom:130px;"><strong> Activity !</strong></h5>
        <!-- Authoree details -->

              <section id="authors" class="my-5 text-center">
                <div class="container">

                  <div class="row">
                    <div class="col text-center">
                      <div class="card">
                        <div class="card-body">
                          <img src="img/person1.jpg" alt="" class="img-fluid rounded-circle  mb-3">
                          <h3>SPORTS</h3>
                          <h5 class="text-muted"></h5>
                          <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Recusandae molestiae alias expedita quae esse ut.</p>
                          <h4 class="text-sm-left">Tag Name :</h4>
                          <h4 class="text-sm-left">Name :</h4>
                          <h4 class="text-sm-left">Description :</h4>
                          <h4 class="text-sm-left">Event date :</h4>
                          <h4 class="text-sm-left">Activity Count :</h4>
                          <form action="">
                            <div class="form-group">
                              <h4 class="text-sm-left">Comments : </h4>
                              <textarea type="text" class="form-control form-control-lg" placeholder="Tag Name">Your Comments
                              </textarea>
                            </div>
                          </form>
                          <h4 class="text-sm-left">Location on Map:</h4>
                        </div>
                      </div>
                    </div>

                      </div>
                    </div>

              </section>

      </div>
    </div>
  </header>

</body>
</html>
