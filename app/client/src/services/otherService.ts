import axios from 'axios';
import type { Program } from '@/models/Program';
import type { Record } from '@/models/Record';

export class OtherService{
    public async getAllPrograms(){
        const token = sessionStorage.getItem('token')
        try {
            const response = await axios.get('http://localhost:8080/program/getAll',{
            headers: {
                Authorization: `Bearer ${token}`
              }
        });
            return response.data as Program[];
        } catch (error) {
            throw new Error('Failed to login user');
        }
    }

    public async getAllRecords(){
        const token = sessionStorage.getItem('token')
        try {
            const response = await axios.get('http://localhost:8080/record/getAll',{
            headers: {
                Authorization: `Bearer ${token}`
              }
        });
            return response.data as Record[];
        } catch (error) {
            throw new Error('Failed to login user');
        }
    }
}