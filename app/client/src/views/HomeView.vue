<script setup lang="ts">
import router from '@/router';


</script>

<template>  
  <div class="home-page-wrapper">
    <div class="start-section__background">
      <div class="start-section">
        <nav>
          <img src="/src/assets/img/strive-logo--black.png" alt="Strive_logo" class="nav__logo">
          <div class="nav__links-wrapper">
            <a href="#serviceLink"><p>Services</p></a>
            <a href="#aboutUsLink"><p>About us</p></a>
            <a href="#"><p>Reviews</p></a>
          </div>
          <RouterLink to="/signUp"><div class="nav__sign-page-link">
            <p>sign up</p>
            <img src="/src/assets/img/nav__sign-page-link-arrow.png" alt="arrow_image">
          </div></RouterLink>
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
    <div class="service" id="serviceLink">
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
    <div class="about-us"  id="aboutUsLink">
        <div class="top">
            <div class="top-left">
                <div class="top-left__button-decorative">
                    <p>Let’s begin</p>
                </div>
                <h1>How to get
                    started with
                    Strive
                </h1>
                <div class="top-left__button-real">
                  <p>Let’s begin</p>
                  <img src="/src/assets/img/top-left__button-real-arrow-img.png" alt="arrow_image">
                </div>
            </div>
            <div class="top-right">
                <img src="/src/assets/img/top-right__timeline-img.png" alt="numbered_timeline">
                <h2>Choose your plan</h2>
                <p>Lorem ipsum dolor sit amet consectetur. Nunc magna tincidunt vel dignissim. Enim enim id elit amet sagittis. Sit convallis fringilla viverra mauris morbi eget dolor mauris eleifend.</p>
                <h2>Choose your plan</h2>
                <p>Lorem ipsum dolor sit amet consectetur. Nunc magna tincidunt vel dignissim. Enim enim id elit amet sagittis. Sit convallis fringilla viverra mauris morbi eget dolor mauris eleifend.</p>
                <h2>Choose your plan</h2>
                <p>Lorem ipsum dolor sit amet consectetur. Nunc magna tincidunt vel dignissim. Enim enim id elit amet sagittis. Sit convallis fringilla viverra mauris morbi eget dolor mauris eleifend.</p>
            </div>
        </div>
        <div class="bottom">
          <div class="bottom-left">
            <div class="bottom-left__button-decorative">
                <p>Testimony</p>
            </div>
            <h1>About our passion
                to help people
            </h1>
            <p>Lorem ipsum dolor sit amet consectetur. Nunc magna tincidunt vel dignissim. Enim enim id elit amet sagittis. Sit convallis fringilla viverra mauris morbi eget dolor mauris eleifend.</p>
            <div class="bottom-left__button-real">
              <p>Learn more</p>
              <img src="/src/assets/img/top-left__button-real-arrow-img.png" alt="arrow_image">
            </div>
          </div>
          <img src="/src/assets/img/bottom-right__image.png" alt="gym image">
        </div>
    </div>
    <div class="footer">
      <img src="/src/assets/img/strive-logo--white.png" alt="Strive_logo" class="footer-logo">
      <div class="footer__links-wrapper">
        <a href="#serviceLink"><p>Services</p></a>
        <a href="#aboutUsLink"><p>About us</p></a>
        <a href="#"><p>Reviews</p></a>
      </div>
      <div class="footer__social-media">
          <img src="/src/assets/img/facebook_logo.png" alt="facebook logo">
          <img src="/src/assets/img/instagram_logo.png" alt="facebook logo">
          <img src="/src/assets/img/tiktok_logo.png" alt="facebook logo">
      </div>
    </div>
  </div>
</template>

<style scoped>
       @import url('https://fonts.googleapis.com/css2?family=Hanken+Grotesk:ital,wght@0,100..900;1,100..900&display=swap');
      @font-face {
        font-family: Oddval-SemiBoldItalic;
        src: url(/src/assets/fonts/oddval/Oddval-SemiBoldItalic.ttf);
      }
      @font-face {
        font-family: Oddval-SemiBold;
        src: url(/src/assets/fonts/oddval/Oddval-SemiBold.ttf);
      }
      
     
     


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

        p{
          font-family: "Hanken Grotesk", sans-serif;
        }
  }
  .nav__logo{
    height: 20px;
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
    font-size: 80px;
    text-align: center;
    width: 800px;
    font-family: Oddval-SemiBold;
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
        font-family: "Hanken Grotesk", sans-serif;
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
        font-family: Oddval-SemiBold;
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
        font-family: "Hanken Grotesk", sans-serif;
      }
      h4{
        color: #14151A;
        font-size: 22px;
        margin-bottom: -10px;
        font-family: Oddval-SemiBold;
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
    height: 610px;
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
          font-family: Oddval-SemiBold;
        }

        .service__rows--header-modified{
            width:470px;
        }


        p{
          font-size: 22px;
          height: unset;
          width: 500px;
          font-family: "Hanken Grotesk", sans-serif;
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



  .about-us{
    width: 100%;
    height:1300px;
    display: flex;
    flex-direction: column;
    justify-content: space-around;
    margin-top: 230px;
    background-color: white;
    border-bottom:5px solid #FFFF;
    border-radius: 300px;
  }
  .top{
    width: 100%;
    display: flex;
    justify-content: space-evenly;
    height:unset;
  }
  .top-left{
    width:unset;
    height:100%;
    display: flex;
    flex-direction: column;
    justify-content: center;

     h1{
        font-size: 50px;
        width: 350px;
        margin-bottom: 35px;
        margin-top: 25px;
        font-family: Oddval-SemiBold;

      }
  }
  .top-left__button-decorative{
    width:170px;
    height: 45px;
    display: flex;
    justify-content: center;
    align-items: center;
    border-style: solid;
    border-radius: 100px;
    border-color: #2D2D35;
    border-width: 2px;
      p{
        font-size: 20px;
        color:#2D2D35;
        font-family: "Hanken Grotesk", sans-serif;
      }
  }
  .top-left__button-real{
    width:202px;
    height: 57px;
    margin-left: 50px;
    display: flex;
    justify-content: center;
    align-items: center;
    border-style: solid;
    border-radius: 100px;
    border-color: #2D2D35;
    background-color:#D5FF5F;
    cursor: pointer;
    border-width: 2px;
    -webkit-box-shadow: 21px 15px 0px 5px rgba(0,0,0,1);
    -moz-box-shadow: 21px 15px 0px 5px rgba(0,0,0,1);
    box-shadow: 5px 5px 0px 0px rgba(0,0,0,1);
      p{
        font-size: 25px;
        color:#2D2D35;
        font-family: "Hanken Grotesk", sans-serif;
      }
      img{
        margin-bottom: -8px;
      }
  }
  .top-right{
    width:unset;
    height:100%;
    position: relative;
    display: flex;
    flex-direction: column;
    justify-content: flex-end;


      img{
        position: absolute;
        top:0;
        left:0;

      }
      p{
        font-size: 16px;
        color:#2D2D35; 
        width:580px;
        padding-left: 120px;
        font-family: "Hanken Grotesk", sans-serif;
      }
      h2{
        font-size: 25px;
        padding-left: 120px;
        margin-bottom: 10px;
        margin-top: 42px;
        font-family: Oddval-SemiBold;

      }

  }
  .top-right h2:nth-child(2){
    margin-top: 25px;
  }
  .bottom{
    width: 100%;
    display: flex;
    justify-content: space-evenly;
    height:unset;
  }
  .bottom-left{
    width:unset;
    height:100%;
    display: flex;
    flex-direction: column;
    justify-content: center;

     h1{
        font-size: 55px;
        width: 477px;
        margin-bottom: 5px;
        margin-top: 25px;
        font-family: Oddval-SemiBold;

      }

      p{
        font-size: 24px;
        width: 567px;
        font-family: "Hanken Grotesk", sans-serif;
      }
  }
  .bottom-left__button-decorative{
    width:170px;
    height: 45px;
    display: flex;
    justify-content: center;
    align-items: center;
    border-style: solid;
    border-radius: 100px;
    border-color: #2D2D35;
    border-width: 2px;
      p{  
        width: unset;
        font-size: 20px;
        color:#2D2D35;
        font-family: "Hanken Grotesk", sans-serif;
      }
  }
  .bottom-left__button-real{
    width:202px;
    height: 57px;
    margin-top: 20px;
    display: flex;
    justify-content: center;
    align-items: center;
    border-style: solid;
    border-radius: 100px;
    border-color: #2D2D35;
    background-color:#D5FF5F;
    cursor: pointer;
    border-width: 2px;
    -webkit-box-shadow: 21px 15px 0px 5px rgba(0,0,0,1);
    -moz-box-shadow: 21px 15px 0px 5px rgba(0,0,0,1);
    box-shadow: 5px 5px 0px 0px rgba(0,0,0,1);
    font-family: "Hanken Grotesk", sans-serif;
      p{
        font-size: 25px;
        color:#2D2D35;
        width: unset;
      }
      img{
        margin-bottom: -8px;
      }
  }



  .footer{
    width:100%;
    height: 250px;
    margin-top: 50px;
    display: flex;
    justify-content: space-around;
    align-items: flex-start;
    color: white;
  }
  .footer-logo{
    margin-top: 70px;
  }
  .footer__links-wrapper{
    margin-top: 50px;
    display: flex;
    justify-content: center;
    align-items: center;
    color: white;
      p{
        font-size: 25px;
        padding-left: 40px;
        padding-right: 40px;
        font-family: "Hanken Grotesk", sans-serif;
      }
      a{
        color: white;
      }
      
  }
  .footer__social-media{
    margin-top: 70px;
    width: 170px;
    display: flex;
    justify-content: space-between;
  }


</style>
