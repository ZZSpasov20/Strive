import type { User } from '@/models/User';
import router from '@/router';
import axios from 'axios';

export class UserService{
    public async getCurrent(username: string, password: string){
        const token = sessionStorage.getItem('token')
        if (token === 'Login unsuccessful' || token == "" || token == null) {
            router.push('/')
          }

        try {
            const response = await axios.get('http://localhost:8080/client/current',{
            headers: {
                Authorization: `Bearer ${token}`
              }
        });
            return response.data as User;
        } catch (error) {
            throw new Error('Failed to login user');
        }
    }

    public async updateUser(userInfo: User){
        const token = sessionStorage.getItem('token')
        try {
            const response = await axios.put('http://localhost:8080/client/update', userInfo, {
            headers: {
                Authorization: `Bearer ${token}`
              }
        });
            return response.data as User;
        } catch (error) {
            throw new Error('Failed to login user');
        }
    }
}