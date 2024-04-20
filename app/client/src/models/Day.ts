import type { DaysExercise } from "./DaysExercise";
import type { Program } from "./Program";
import type { Record } from "./Record";

export interface Day {
    dayId?: number;
    name?: string;
    program?: Program;
    daysExercises?: DaysExercise[];
    records?: Record[];
}