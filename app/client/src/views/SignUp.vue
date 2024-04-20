<script setup lang="ts">
import router from '@/router';
import { AuthService } from '../services/authService'
import { ref } from 'vue';
import type { User } from '@/models/User';

const userInfo = ref<User>({})


const f_signup = new AuthService().signup

async function signup(){
    if (userInfo.value) {
    try {
      await f_signup(userInfo.value);
      router.push('/login');
    } catch (error) {
      console.error(error);
    }
  }  
}

</script>

<template>
    <div class="sign-up-page-wrapper">
        <div class="logo-wrapper">
            <img src="/src/assets/img/strive-logo--white.png" alt="logo-white">
        </div>
        <h1>Sign up to Strive</h1>
        <form action="">
            <div class="row-input-wrapper">
                <div class="input-and-label-wrapper">
                    <label for="FirstName" class="input-label">First Name<span class="star--modify"> *</span></label>
                    <input v-model="userInfo.firstName" type="text" name="FirstName" placeholder="Hristo" required>
                </div>
                <div class="input-and-label-wrapper">
                    <label for="LastName" class="input-label">Last Name<span class="star--modify"> *</span></label>
                    <input v-model="userInfo.lastName" type="text" name="LastName" placeholder="Simeonov" required>
                </div>
            </div>
            <div class="row-input-wrapper">
                <div class="input-and-label-wrapper">
                    <label for="Email" class="input-label">Email<span class="star--modify"> *</span></label>
                    <input v-model="userInfo.emailAddress" type="email" name="Email" placeholder="hristosimeonov@durjavata.com" required>
                </div>
                <div class="input-and-label-wrapper">
                    <label for="Username" class="input-label">Username<span class="star--modify"> *</span></label>
                    <input v-model="userInfo.username" type="text" name="Username" placeholder="HSimeonov1" required>
                </div>
            </div>
            <div class="row-input-wrapper">
                <div class="input-and-label-wrapper">
                    <label for="Password" class="input-label">Password<span class="star--modify"> *</span></label>
                    <input v-model="userInfo.password" type="password" name="Password" placeholder="Password123" required>
                </div>
                <div class="input-and-label-wrapper">
                    <label for="Date" class="input-label">Date of Birth<span class="star--modify"> *</span></label>
                    <input v-model="userInfo.birthDate" type="date" name="Date" placeholder="11/2/2024" required>
                </div>
            </div>
            <div @click="signup()" class="form-buttom">
                <p>Sign up</p>
            </div>
            <RouterLink to="/login"><p class="login-page-link">
                Alredy have an account? Log in
                </p>
            </RouterLink>
        </form>
    </div>
</template>

<style scoped>

        
    .logo-wrapper{
        width:100%;
        height: 80px;
        display: flex;
        align-items: center;
            img{
            padding-left: 200px;  
            }

    }
    .sign-up-page-wrapper{
        width:100%;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        background-color: #14151A;

            h1{
                color: white;
                font-size: 58px;
                margin-top: 100px;
                margin-bottom: 70px;  
                font-family: "Hanken Grotesk", sans-serif;
            }
    }
    form{
        width:1000px;
        height:unset;
        display: flex;
        flex-direction: column;
  
    }
    .row-input-wrapper{
        width:100%;
        height:110px;
        margin-bottom: 50px;
        display: flex;
        justify-content: space-between;
       
    }
    .input-and-label-wrapper{
        display: flex;
        flex-direction: column;
        justify-content: space-between;
        height:100%;
        width:470px;
      
    }
    .input-label{
        font-size: 24px;
        font-family: "Hanken Grotesk", sans-serif;
        color:white;
    }
    .star--modify{
        color: #D5FF5F;
    }
    input{
        width:466px;
        height:62px;
        display: center;
        justify-content: flex-start;
        outline:none;
        font-size: 24px;
        background-color: transparent;
        border-radius: 10px;
        border: 2px solid #2D2D35; 
        color: #68687A;
        box-sizing: border-box; 
        padding-left: 20px;
        font-family: "Hanken Grotesk", sans-serif;
       
            p{
                margin-left: 10px;
                font-family: "Hanken Grotesk", sans-serif;
            }
    }
    input:focus{
        outline:none;
        color:white;
        font-size: 24px;
        font-family: "Hanken Grotesk", sans-serif;

    }
    .form-buttom{
        width:466px;
        height: 62px;
        display: flex;
        justify-content:center ;
        align-items: center;
        border-radius: 10px;
        align-self: center;
        background: #D5FF5F; 
        font-size:24px;
        margin-top: 30px;
        cursor: pointer;
        font-family: "Hanken Grotesk", sans-serif;
    }
    .login-page-link{
        font-size: 20px; 
        color:#D5FF5F;
        text-align: center;
        margin-top: 30px;
        font-family: "Hanken Grotesk", sans-serif;
    }

</style>