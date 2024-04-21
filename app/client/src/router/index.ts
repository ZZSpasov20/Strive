import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import SignUp from '@/views/SignUp.vue'
import LoginView from '@/views/LoginView.vue'
import MainView from '@/views/MainView.vue'
import ProgramView from '@/views/ProgramView.vue'
import FitnessView from '@/views/FitnessView.vue'



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
      
    },
    {
      path: '/fitness',
      name: 'fitnessView',
      component: FitnessView
      
    },
    {
      path: '/program',
      name: 'programView',
      component: ProgramView
      
    }
  ]
})

export default router
