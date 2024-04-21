<script setup lang="ts">

</script>

<template>
    <div class="fitness-statistics-wrapper">
        <div class="fitness-statistics">
            <div class="main-statistics__row">
                <h1>Push, Pull, Legs</h1>
                <div class="main-statistics__person-wrapper">
                    <div class="main-statistics__person-text-wrapper">
                        <p>Simeon Boev</p>
                        <p>Customer</p>
                    </div>
                    <img class="profile-picture" src="/src/assets/img/google_logo.png" />
                </div>
            </div>
            <div class="program-wrapper">

                <div class="program-row program-row-first">
                    <p class="stats-wraper--headings">Exercise</p>
                    <div class="stats-wraper stats-wraper--headings">
                        <p>Sets</p>
                        <p>Reps</p>
                        <p>Top kg’s</p>
                        
                    </div>
                </div>
                <div class="program-row program-row-second">
                        <p>Face Pulls</p>
                        <div class="stats-wraper">
                            <p>4</p>
                            <p>12</p>
                            <p>30kg</p>
                            <img src="/src/assets/img/drop-down-icon.png" alt="drop-down-image">
                        </div>
                </div>
                <div class="program-row">
                    <p>Bench Press</p>
                    <div class="stats-wraper">
                        <p>3</p>
                        <p>5</p>
                        <p>70kg</p>
                        <img src="/src/assets/img/drop-down-icon.png" alt="drop-down-image">
                    </div>
                </div>
                <div class="program-row program-row-sub">
          
                    <div class="stats-wraper">
                        <p>1</p>
                        <p>2</p>
                        <p>70kg</p>
                    </div>
                </div>
                <div class="program-row">
                    <p>Cable Flyes</p>
                    <div class="stats-wraper">
                        <p>3</p>
                        <p>5</p>
                        <p>70kg</p>
                        <img src="/src/assets/img/drop-down-icon.png" alt="drop-down-image">
                    </div>
                </div>
                <div class="program-row">
                    <p>Leg Extension</p>
                    <div class="stats-wraper">
                        <p>3</p>
                        <p>5</p>
                        <p>70kg</p>
                        <img src="/src/assets/img/drop-down-icon.png" alt="drop-down-image">
                    </div>
                </div>
               <div class="program-row program-row-sub">
          
                    <div class="stats-wraper">
                        <p>1</p>
                        <p>2</p>
                        <p>70kg</p>
                    </div>
                </div>
                <div class="program-row program-row-sub">
          
                    <div class="stats-wraper">
                        <p>2</p>
                        <p>23</p>
                        <p>70kg</p>
                    </div>
                </div>
                
            </div>
        </div>
    </div>
</template>

<style>
      @import url('https://fonts.googleapis.com/css2?family=Hanken+Grotesk:ital,wght@0,100..900;1,100..900&display=swap');


    .fitness-statistics-wrapper{
        width:100%;
        height: 100vh;
        min-height: 750px;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .fitness-statistics{
        width: 1695px;
        height: 869px; 
        border-radius: 36px;
        background: #FFF;
        display: flex;
        flex-direction: column;
        justify-content: flex-start;
        align-items: center;
      
    }
    .main-statistics__row{
        width:100%;
        display: flex;
        justify-content: space-between;
        margin-top: 20px;
            h1{
                font-size: 45px;
                padding-left: 100px;
                font-family: Oddval-SemiBold;
            }
    }
    .main-statistics__person-wrapper{
        width:230px;
        display: flex;
        justify-content: space-around;
        align-items: center;
        margin-right: 100px;
        
    }
    .main-statistics__person-text-wrapper{
        display: flex;
        flex-direction: column;
        align-items: flex-end;
        justify-content: center;
    }
    .main-statistics__person-text-wrapper p:nth-child(1){
        color:#14151A;
        font-size: 25px;
        margin-bottom: -10px;
        font-family: Oddval-SemiBold;
    }
    .main-statistics__person-text-wrapper p:nth-child(2){
        color:#14151A;
        font-size: 14px;
        font-family: "Hanken Grotesk", sans-serif;
    }
    .profile-picture{
        display: flex;
        justify-content: center;
        align-items: center;
        width: 40px;
        height: 40px;
        border-radius: 100%;
        border-color: white;
        border-style: solid;
        margin-top: 15px;
    }

    .program-wrapper{
        background-color: #F9FAFF;
        display: flex;
        flex-direction: column;
        width:1265px;
        height: 550px;
        align-items: center;
        overflow: auto;
    }
    .program-row{
        display: flex;
        justify-content: space-between;
        border-top: solid 1px #CACACA;
        border-bottom: solid 1px #CACACA;
        width:1100px;
        height: unset;
        font-family: "Hanken Grotesk", sans-serif;
        font-size: 22px;
    }
    .program-wrapper .program-row-first{
        margin-top: 40px;
        margin-bottom: -20px;
        border-top: none;
        border-bottom: none;
    }
    .program-wrapper .program-row-second{
        border-top: none;

    }
    .stats-wraper--headings{
        font-size: 19px;
    }
    .program-row-sub{
        justify-content: flex-end;
        height: 74px;
    
        align-items: center;
    }
    .stats-wraper{
        display: flex;
        width: 440px;
        height: 100%;
        flex-direction: row;
        align-items: center;
        justify-content: space-around;
        box-sizing: border-box;
        padding-right: 30px;
        position: relative;
         img{
                position: absolute;
                right: 0;
                cursor: pointer;
            }
        
    }
</style>