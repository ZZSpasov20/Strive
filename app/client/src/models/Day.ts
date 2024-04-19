import { DaysExercise } from "./DaysExercise";
import { Program } from "./Program";
import { Record } from "./Record";

export interface Day {
    dayId: number;
    name: string;
    program: Program;
    daysExercises: DaysExercise[];
    records: Record[];
}