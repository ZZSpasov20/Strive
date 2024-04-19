import { Day } from "./Day";
import { Exercise } from "./Exercise";

export interface DaysExercise {
    day: Day;
    exercise: Exercise;
    exerciseOrder: number;
    setNumber: number;
}