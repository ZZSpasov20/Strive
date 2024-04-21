import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import SignUp from '@/views/SignUp.vue'
import LoginView from '@/views/LoginView.vue'
import Nav from '@/components/Nav.vue'
import MainView from '@/views/MainView.vue'
import FItnessView from '@/views/FItnessView.vue'



const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
      
    },
    {
      path: '/signUp',
      name: 'signUp',
      component: SignUp  
      
    },
    {
      path: '/login',
      name: 'loginView',
      component: LoginView
      
    },
    {
      path: '/main',
      name: 'mainView',
      component: MainView
      
    }
    ,
    {
      path: '/fitness',
      name: 'fitnessView',
      component: FItnessView
      
    }
  ]
})

export default router
