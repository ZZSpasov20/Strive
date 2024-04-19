import axios from 'axios';
import { User } from '../models/User';

export class UserService {
    private API_URL = 'localhost:8080/';

    public async login(username: string, password: string){
        try {
            const response = await axios.post(`${this.API_URL}login`,
                {
                    username,
                    password
                }
            );
            return response.data;
        } catch (error) {
            throw new Error('Failed to login user');
        }
    }

    public async signup(username: string, password: string){
        try {
            const response = await axios.post(`${this.API_URL}signup`,
                {
                    username,
                    password
                }
            );
            return response.data;
        } catch (error) {
            throw new Error('Failed to signup user');
        }
    }
}