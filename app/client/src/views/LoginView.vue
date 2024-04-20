<script setup lang="ts">
import { ref } from 'vue';
import { AuthService } from '../services/authService'
import { routeLocationKey } from 'vue-router';
const f_login = new AuthService().login;

const username = ref()
const password = ref()

async function login(){
    const responseToken = await f_login(username.value, password.value);
    sessionStorage.setItem('token', responseToken);
}


</script>

<template>
     <div class="login-page-wrapper">
        <div class="logo-wrapper">
            <img src="/src/assets/img/strive-logo--white.png" alt="logo-white">
        </div>
        <h1>Log in to Strive</h1>
        <form action="">
            <div class="input-and-label-wrapper">
                <label for="Email" class="input-label">Email<span class="star--modify"> *</span></label>
                <input v-model="username" type="email" name="Email" placeholder="hristosimeonov@durjavata.com" required>
            </div>
            <div class="input-and-label-wrapper">
                <label for="Password" class="input-label">Password<span class="star--modify"> *</span></label>
                <input v-model="password" type="password" name="Password" placeholder="Password123" required>
            </div>
            <p class="forgot-passowrd-text">Forgot Password ?</p>
            <div class="form-buttom" @click="login()">
                <p>Log in</p>
            </div>
        </form>
        <div class="or-wrapper">
            <div class="or-line"></div>
            <p>OR</p>
            <div class="or-line"></div>
        </div>
        <div class="alternative-login">
            <img src="/src/assets/img/google_logo.png" alt="google_logo">
            <p>Sign in with Google</p>
            <div class="just-spacing">

            </div>
        </div>
        <div class="alternative-login">
            <img src="/src/assets/img/apple_logo.png" alt="apple_logo">
            <p>Sign in with Apple</p>
            <div class="just-spacing">

            </div>
        </div>
        <RouterLink to="/signUp"><p class="sign-up-link">New to Strive? Sign up</p>
        </RouterLink>
    </div>
</template>

<style scoped>
    .login-page-wrapper{
        width:100%;
        height: unset;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        background-color: #14151A;
        padding-bottom: 12px;

            h1{
                color: white;
                font-size: 58px;
                margin-top: 100px;
                margin-bottom: 15px;
            }
    }
    .logo-wrapper{
        width:100%;
        height: 80px;
        display: flex;
        align-items: center;
            img{
            padding-left: 200px;  
            }

    }

    form{
        width:470px;
        display: flex;
        flex-direction: column;
        justify-content: center;
    }
    .input-and-label-wrapper{
        display: flex;
        flex-direction: column;
        justify-content: space-between;
        height:100%;
        width:470px;
        margin-bottom: 30px;
    }
    .input-label{
        font-size: 24px;
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
       
            p{
                margin-left: 10px;
            }
    }
    input:focus{
        outline:none;
        color:white;
        font-size: 24px;

    }
    .forgot-passowrd-text{
        margin-top: -20px;
        margin-bottom: 0px;
        font-size: 20px;
        color: white;
        cursor: pointer;
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
    }
    .or-wrapper{
        width:470px;
        height:unset;
        display: flex;
        justify-content:space-between ;
        align-items: center;

            p{
                font-size: 20px;
                color: #68687A;
            }
    }
    .or-line{
        width:45%;
        height:1px;
        background-color:#68687A ;
    }
    .alternative-login{
        width: 466px;
        height: 62px;
        border-radius: 10px;
        border: 2px solid #2D2D35; 
        display: flex;
        align-items: center;
        justify-content: space-around;
        cursor: pointer;
        margin-bottom: 30px;

            p{
                font-size: 20px; 
                color:white;
            }
    }
    .just-spacing{
        width:28px;
        height:28px;
    }
    .sign-up-link{
        color:#D5FF5F;
        text-align: center;
        font-size: 16px; 
    }

</style>