<script setup lang="ts">

</script>

<template>
    <div class="program-statistics-wrapper">
        <div class="program-statistics">
            <div class="main-statistics__row">
                <h1>Your Workouts</h1>
                <div class="main-statistics__person-wrapper">
                    <div class="main-statistics__person-text-wrapper">
                        <p>Simeon Boev</p>
                        <p>Customer</p>
                    </div>
                    <img class="profile-picture" src="/src/assets/img/google_logo.png" />
                </div>
            </div>
            <div class="program-row-wrapper">
                <div class="program-row">
                    <div class="program-row__name-wrapper">
                        <p>Workout Name</p>
                        <h2>Push, Pull, Legs</h2>
                    </div>
                    <div class="program-row__icons-wrapper">
                        <div  class="program-row__icons program-row__icons--green">
                            <img src="/src/assets/img/tick-icon.png" alt="tick-icon">
                        </div>
                        <div  class="program-row__icons program-row__icons--yellow">
                            <img src="/src/assets/img/pencil-icon.png" alt="pencil-icon">
                        </div>
                        <div  class="program-row__icons program-row__icons--red">
                                <img src="/src/assets/img/bin-icon.png" alt="bin-icon">
                        </div>
                    </div>
                </div>
                <div class="program-row">
                    <div class="program-row__name-wrapper">
                        <p>Workout Name</p>
                        <h2>Arnold split</h2>
                    </div>
                    <div class="program-row__icons-wrapper">
                        <div  class="program-row__icons program-row__icons--green">
                            <img src="/src/assets/img/tick-icon.png" alt="tick-icon">
                        </div>
                        <div  class="program-row__icons program-row__icons--yellow">
                            <img src="/src/assets/img/pencil-icon.png" alt="pencil-icon">
                        </div>
                        <div  class="program-row__icons program-row__icons--red">
                                <img src="/src/assets/img/bin-icon.png" alt="bin-icon">
                        </div>
                    </div>
                </div>
                
            </div>

        </div>
    </div>
</template>

<style scoped>
    @import url('https://fonts.googleapis.com/css2?family=Hanken+Grotesk:ital,wght@0,100..900;1,100..900&display=swap');

    .program-statistics-wrapper{
        width:100%;
        height: 100vh;
        min-height: 750px;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .program-statistics{
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
    

    .program-row-wrapper{
        display: flex;
        flex-direction: column;
        align-items: center;
        width: 1151px;
        height: 700px;
        overflow: auto;
    }
    .program-row{
        display: flex;
        flex-direction:row;
        justify-content: space-between;
        align-items: center;
        width: 100%;
        height: 110px;
        border-radius: 13px;
        border-color:#F9FAFF ;
        background: #F9FAFF;
        margin-top: 20px;
    }
    .program-row__name-wrapper{
        display: flex;
        flex-direction: column;
        margin-left: 30px;
            h2{
                font-family: "Hanken Grotesk";
                font-size: 36px; 
                color: #14151A; 
                margin: 0px;
            }
            p{
                color: #14151A;
                font-family: "Hanken Grotesk";
                font-size: 19.089px; 
                margin: 0px;
            }
    }
    .program-row__icons-wrapper{
        display: flex;
        width:unset;
        margin-right: 30px; 
    }
    .program-row__icons{
        width:50px;
        height: 50px;
        border: solid 2px;
        border-radius: 10.129px; 
        background: #F0F0F0; 
        margin-left: 5px;
        margin-right: 5px;
        display: flex;
        justify-content: center;
        align-items: center;
        cursor: pointer;
    }
    .program-row__icons--green{
        border-color: #71E98A;
    }
    .program-row__icons--yellow{
        border-color: #F8BD00;
    }
    .program-row__icons--red{
        border-color: #FF5F53;
    }
</style>