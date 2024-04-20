import type { Day } from "./Day";
import type { Exercise } from "./Exercise";

export interface DaysExercise {
    day?: Day;
    exercise?: Exercise;
    exerciseOrder?: number;
    setNumber?: number;
}