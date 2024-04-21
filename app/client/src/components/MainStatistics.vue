<script setup lang="ts">
    import { ref, defineComponent } from 'vue';
    import { Bar } from 'vue-chartjs';
    import { Line } from 'vue-chartjs'

    import {
        Chart as ChartJS,
        CategoryScale,
        LinearScale,
        PointElement,
        LineElement,
        BarElement,
        ArcElement,
        Title,
        Tooltip,
        Legend
    } from 'chart.js';

        ChartJS.register(
        CategoryScale,
        LinearScale,
        PointElement,
        LineElement,
        BarElement,
        ArcElement,
        Title,
        Tooltip,
        Legend
    );


    const chartData = ref({
    labels: ['January', 'February', 'March'],
    datasets: [
        {
        label: 'Consistency',
        backgroundColor: '#f87979',
        data: [15, 17, 12]
        }
    ]
    });

    defineComponent({
    name: 'BarChart',
    components: { Bar }
    });

    const lineData = ref({
        labels: ['04.4', '11.4', '18.4', '25.4', '1.4'],
    datasets: [
        {
        label: 'Lay pulldown',
        backgroundColor: '#CCDFFF',
        borderColor: 'rgba(54, 162, 235, 1)',
        borderWidth: 1,
        hoverBackgroundColor: 'rgba(54, 162, 235, 0.4)',
        hoverBorderColor: 'rgba(54, 162, 235, 1)',
        data: [65, 70, 70, 80, 85,],
        fill: true,
        }
    ]
    });

    defineComponent({
    name: 'Line',
    components: { Line  }
    });

    import { Doughnut } from 'vue-chartjs'

    const DoughnutChart = ref({
        labels: ['Arms', 'Chest', 'Legs', 'Back', 'Shoulders'],
    datasets: [
        {
        label: 'DConsistency by days',
        backgroundColor: '#D6FFCC',
        data: [14, 12, 7, 15, 13]
        }
    ]
    });

    const DoughnutChartOptions = ref({
        responsive: true,
    maintainAspectRatio: false
    });

    defineComponent({
    name: 'Doughnut',
    components: { Doughnut  }
    });

</script>

<template>

    <div class="main-statistics-wrapper">
        <div class="main-statistics">
            <div class="main-statistics__row">
                <h1>Overview</h1>
                <div class="main-statistics__person-wrapper">
                    <div class="main-statistics__person-text-wrapper">
                        <p>Simeon Boev</p>
                        <p>Customer</p>
                    </div>
                    <img class="profile-picture" src="/src/assets/img/google_logo.png" />
                </div>
            </div>
            <div class="main-statistics__row2">
                <div class="resource">
                    <p class="resource-heading">Revenues</p>
                    <p class="resource-main-stats">15%</p>
                    <p class="resource-main-under-text">Increase compared to last week</p>
                    <div class="resource-additional">
                      <p>Revenues report</p>
                      <img src="/src/assets/img/arrow.png" alt="arrow">
                    </div>
                </div>
                <div class="resource">
                    <p class="resource-heading">Lost deals</p>
                    <p class="resource-main-stats">4%</p>
                    <p class="resource-main-under-text">You closed 96 out of 100 deals</p>
                    <div class="resource-additional">
                      <p>All deals</p>
                      <img src="/src/assets/img/arrow.png" alt="arrow">
                    </div>
                </div>
                <div class="resource">
                    <p class="resource-heading">Quarter goal</p>
                    <img src="/src/assets/img/84statistic.png" alt="84%">
                    <div class="resource-additional">
                      <p>All goals</p>
                      <img src="/src/assets/img/arrow.png" alt="arrow">
                    </div>
                </div>
            </div>
            <div class="main-statistics__row3"><p class="diagrams-h">Diagrams</p></div>
            <div class="main-statistics__row4">
                <div class="row4-div">
                    
                    <Bar :data="chartData" />
                   
                </div>
                <div class="row4-div">
                    <Line :data="lineData"  />  
                </div>
                <div class="row4-div">
                    <Doughnut :data="DoughnutChart" :options="DoughnutChartOptions" />
                </div>

                

            </div>
        </div>
    </div>

</template>

<style scoped>

    .main-statistics-wrapper{
        width:100%;
        height: 100vh;
        min-height: 750px;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .main-statistics{
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

    .main-statistics__row2{
        width:100%;
        display: flex;
        justify-content: space-around;
        margin-top: 30px;
        box-sizing: content-box;
        padding-left: 0px;

        
    }
    .main-statistics__row2 div:nth-child(3){
        width: unset;
    }
    .resource{
        display: flex;
        flex-direction: column;
        align-items: flex-start;
        width: 350px;
        height: unset;
            p{
                margin: 10px;
                font-family: "Hanken Grotesk", sans-serif;
            }
         
    }
    .resource-heading{
        font-size: 27px;
        padding-bottom: 10px;  
        font-family: "Hanken Grotesk", sans-serif;
    
    }
    .resource-main-stats{
        font-size: 45px;
        font-family: "Hanken Grotesk", sans-serif;
    }
    .resource-main-under-text{
        font-size: 22px;
        font-family: "Hanken Grotesk", sans-serif;
        color: #454545;
    }
    .resource-additional{
        display: flex;
        width:unset;
        align-items: center;
        justify-content: space-between;
        color: #14151A;
        font-size: 16px;
        margin-top: 10px;
        font-family: "Hanken Grotesk", sans-serif;
            img{
                margin-left: 1px;
            }

            img{
                width: 18px;
                height: 18px;
            }
    }
    .diagrams-h{
        font-size: 34px;   
        padding-left: 110px;
        font-family: Oddval-SemiBold;
   }

    .main-statistics__row3{
        width:100%;
        display: flex;
        box-sizing: content-box;
    }
    .main-statistics__row4{
      
        width: 100%;
        height: 100%;
        display: flex;
        flex-wrap: nowrap;
        overflow-x:scroll;
         overflow-y:hidden; 
        -webkit-overflow-scrolling: touch;
    }

    .row4-div{
        margin-left: 80px;
        margin-right: 10px;
        flex: 0 0 auto;
        width:490px;
        height: 300px;
        border-radius: 26px;
    }
    
    .main-statistics__row4 div:nth-child(1){
        margin-left: 120px;
        background-color: #CCDFFF;
    } 
    .main-statistics__row4 div:nth-child(2){
        background-color: #D6FFCC;
    }   
    .main-statistics__row4 div:nth-child(3){
        background-color: #FEDCF3;
    }   

</style>