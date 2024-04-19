import { Day } from "./Day";
import { Exercise } from "./Exercise";

export interface Record {
    recordId: number;
    day: Day;
    exercise: Exercise;
    exerciseOrder: number;
    setNumber: number;
    reps: number;
    weight: number;
    date: string;
}