import type { User } from "./User";

export interface ClientStat {
    clientStatsId?: number;
    user?: User;
    weight?: number;
    height?: number;
    dateOfTheStats?: string;
}