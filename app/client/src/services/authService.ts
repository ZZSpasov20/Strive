import type { User } from '@/models/User';
import axios from 'axios';

export class AuthService {
    private API_URL = 'localhost:8080/';

    public async login(username: string, password: string){
        try {
            const response = await axios.post('http://localhost:8080/login',
                {
                    username,
                    password
                }
            );
            return response.data as string;
        } catch (error) {
            throw new Error('Failed to login user');
        }
    }

    public async signup(userInfo: User){
        try {
            const response = await axios.post(`http://localhost:8080/signup`, userInfo);
        } catch (error) {
            throw new Error('Failed to signup user');
        }
    }
}