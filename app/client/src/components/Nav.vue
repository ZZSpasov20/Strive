<script setup lang="ts">

</script>

<template>

    <nav>
        <div class="nav__person-icon">
            <img src="/src/assets/img/S.png" alt="S logo for strive">
        </div>
        <div class="nav__icon-wrapper">
            <img src="/src/assets/img/home-icon.png" alt="home_icon" id="home-current">
            <img src="/src/assets/img/calendar-icon.png" alt="calendar_icon" id="calendar-current">
            <img src="/src/assets/img/stats-icon.png" alt="stats_icon" id="stats-current">
            <img src="/src/assets/img/exercise-search-icon.png" alt="exercise-search_icon" id="exercise-search-current">
            <img src="/src/assets/img/chat-icon.png" alt="exercise-search_icon" id="exercise-search-current">
        </div>
        <img src="/src/assets/img/logout-icon.png" class ="logout-icon" alt="logout_icon">
    </nav>


</template>

<style scoped>

    nav{
        display: flex;
        flex-direction: column;
        justify-content: space-around;
        align-items: center;
        min-height: 750px;
        width: 155px;
        height: 100vh;
    }
  .nav__person-icon{
        width: 85px;
        height: 85px; 
        border-radius: 18.75px;
        background: #D5FF5F;
        display: flex;
        justify-content: center;
        align-items: center;
        cursor: pointer;
    } 
    .nav__icon-wrapper{
        display: flex;
        flex-direction: column;
            img{
                margin-top: 20px;
                margin-bottom: 20px;
                cursor: pointer;
            }
    }
    .logout-icon{
        cursor: pointer;
        margin-top: 130px;
    }
</style>