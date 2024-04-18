<script setup lang="ts">

</script>

<template>  
  <div class="home-page-wrapper">
    <div class="start-section__background">
      <div class="start-section">
        <nav>
          <img src="" alt="Strive_logo" class="nav__logo">
          <div class="nav__links-wrapper">
            <p>Services</p>
            <p>About us</p>
            <p>Reviews</p>
          </div>
          <div class="nav__sign-page-link">
            <p>sign up</p>
            <img src="/src/assets/img/nav__sign-page-link-arrow.png" alt="arrow_image">
          </div>
        </nav>
        <h1 class="start-section__header">Begin Your Fitness Journey</h1>
        <div class="main-info">
            <div class="main-info__left">
              <img src="/src/assets/img/main-info__left-quote-img.png" alt="quotes_img">
              <p>
                Now you can learn anywhere,
                anytime, even if there is no
                internet access
              </p>
              <h3>
                10K+
              </h3>
              <p>
                Workouts
              </p>
            </div>
            <div class="main-info__right">
              <img src="/src/assets/img/main-info__right-stars-img.png" alt="stars_img">
              <p>
                Saitcheto e mn dobre, mnogo
                razcukva, piq gazirana voda
                dokato go gledam
              </p>
              <h4>Simeon Boev</h4>
              <p>
                Web Developer
              </p>
            </div>
            <img src="/src/assets/img/main-info__person-img.png" alt="person-img" class="main-info__person-img">
            <img src="/src/assets/img/main-info__circle-img.png" alt="half-circle" class="main-info__circle-img">
        </div>
      </div>
    </div>
    <div class="service">
        <h1 class="service__header">We Offer The <span>Following Services</span></h1>
        <div class="service__rows">
          <h1>1/</h1>
          <h1 class="service__rows--header-modified">Personal Workouts</h1>
          <p>Now you can learn anywhere, anytime, even if there is no internet access</p>
          <img src="/src/assets/img/service__rows-arrow-img.png" alt="arrow image">
        </div>
        <div class="service__separate-line"></div>
        <div class="service__rows">
          <h1>2/</h1>
          <h1 class="service__rows--header-modified">Fitness Plans</h1>
          <p>Now you can learn anywhere, anytime, even if there is no internet access</p>
          <img src="/src/assets/img/service__rows-arrow-img.png" alt="arrow image">
        </div>
        <div class="service__separate-line"></div>
        <div class="service__rows">
          <h1>3/</h1>
          <h1 class="service__rows--header-modified">Set Own Goals</h1>
          <p>Now you can learn anywhere, anytime, even if there is no internet access</p>
          <img src="/src/assets/img/service__rows-arrow-img.png" alt="arrow image">
        </div>
        <div class="service__separate-line"></div>
        <div class="service__rows">
          <h1>4/</h1>
          <h1 class="service__rows--header-modified">One More Thing</h1>
          <p>Now you can learn anywhere, anytime, even if there is no internet access</p>
          <img src="/src/assets/img/service__rows-arrow-img.png" alt="arrow image">
        </div>
    </div>
    <div id="filling">
    </div>
  </div>
</template>

<style scoped>
  .home-page-wrapper{
    width:100%;
    display: flex;
    flex-direction: column;
    background-color: #14151A;
  }

  .start-section__background{
    width:100%;
    height: 900px;
    display: flex;
    background-color: #14151A;
  }
  .start-section{
    width:100%;
    display: flex;
    align-items: center;
    justify-content: flex-start;
    flex-direction: column;
    border-bottom:5px solid #FFFF;
    border-bottom-left-radius: 300px;
    border-bottom-right-radius: 300px;
    background-color: #FFFFFF;
  }
  nav{
    width:100%;
    height: 100px;
    display: flex;
    justify-content: space-around;
    align-items: center;
  }
  .nav__logo{
  }
  .nav__links-wrapper{
    display: flex;
    justify-content: center;
    align-items: center;

      p{
        font-size: 25px;
        color:#2D2D35;
        padding-left: 40px;
        padding-right: 40px;
      }
  }
  .nav__sign-page-link{
    width:170px;
    height: 50px;
    display: flex;
    justify-content: center;
    align-items: center;
    border-style: solid;
    border-radius: 100px;
    border-color: #2D2D35;
    border-width: 2px;
    cursor: pointer;

      p{
        padding-right: 20px;
        font-size: 20px;
        color:#2D2D35;
      }
  }
  .start-section__header{
    color: #14151A;
    font-size: 90px;
    text-align: center;
    width: 750px;
  }
  .main-info{
    position: relative;
    width:100%;
    height: 100%;
    display: flex;
    justify-content:space-around;
    align-items: center;
}
  .main-info__left{
    width:unset;
    display: flex;
    flex-direction: column;
    z-index: 1;
    margin-right:500px;
    margin-top: -70px;
      p{
        color:#2D2D35;
        font-size: 25px;
        width:300px;
      }
      img{
        width:66px;
        margin-bottom: -15px;
      }
      h3{
        color: #14151A;
        font-size: 40px;
        margin-bottom: -15px;
        margin-top: 10px;
      }
  }
  .main-info__right{
    width:unset;
    display: flex;
    flex-direction: column;
    align-items: flex-end;
    z-index: 1;
    margin-top: -140px;

      img{
        width:180px;
        margin-bottom: -15px;
      }

      p{
        color:#2D2D35;
        font-size: 25px;
        width:300px;
        text-align: right;
      }
      h4{
        color: #14151A;
        font-size: 22px;
        margin-bottom: -10px;
      }
  }
  .main-info__right p:last-child{
      color: #2D2D35;
      font-size: 16px;
  }
  .main-info__right p:nth-child(2){
    margin-bottom: 5px;
  }
  .main-info__person-img{
    position: absolute;
    height: 570px;
    left:0;
    right:0;
    bottom: 0;
    margin-left: auto;
    margin-right: auto;
    z-index: 1;
    bottom: -5px;
  }
  .main-info__circle-img{
    position: absolute;
    left:0;
    right:0;
    bottom: -5px;
    margin-left: auto;
    margin-right: auto;
    z-index: 0;
  }

  .service{
    width: 100%;
    display: flex;
    flex-direction: column;
    align-items: center;
    color: #FFFFFF;
    margin-top: 200px;

      h1{
        font-size: 52px;
        width: 600px;
      }

      
      span{
        color: #D5FF5F;
      }
  }
  .service__rows{
      width: 1500px;
      display: flex;
      justify-content: space-between;
      align-items: center;

        h1{
          font-size: 44px;
          width:unset;
        }

        .service__rows--header-modified{
            width:370px;
        }


        p{
          font-size: 22px;
          height: unset;
          width: 500px;
        }
  
  }
  .service__separate-line{
    color: white;
    background-color: #FFFFFF;
    width: 1500px;
    height: 2px;
    margin-top: 15px;
    margin-bottom: 15px;
  }
  .service__header{
    align-self: flex-start;
    margin-left: 200px;
    margin-bottom: 50px;
  }



  #filling{
    height:1500px;
    width: 100%;
    background-color: #14151A;
  }

</style>
