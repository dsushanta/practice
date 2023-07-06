package com.johny.bravo;

import java.util.*;

//Data Class to store name, points and wins/losses of that team.
class entry{
    String name;
    int points;
    String[] win_loss;

    public entry(String name, int points, String[] won_loss) {
        this.name = name;
        this.points = points;
        this.win_loss = won_loss;
    }
}
// Class to store data of Team and to perform multiple operation
class Indian_pre_League {
    ArrayList<entry> list = new ArrayList<>();

    //    Method to store the data of team.
    public void put(String name, int points, String[] win_loss) {
        entry temp_team_data = new entry(name, points, win_loss);
        list.add(temp_team_data);
    }
    //  Method to get the data of Team by passing team name.
    public void get(String str) {
        for(entry key:list){
            if(key.name.equals(str)){
                System.out.println("\n"+str +" points:- "+key.points);
                System.out.println(str+" Wins/Losses:- "+Arrays.toString(key.win_loss));
                break;
            }
        }
    }

    //    Method to get name of team with two consecutive loss.
    public void team_with_two_consecutive_loss(){
        System.out.println("\nTeam with two consecutive loss");
        for (entry key:list){
            for(int i=0;i<key.win_loss.length-1;i++){
                if(key.win_loss[i].equals("loss") && key.win_loss[i+1].equals("loss")){
                    System.out.print(key.name+ " ");
                    break;
                }
            }
        }
    }

    //    Method to get name of team with n consecutive wins and average of filtered team.
    public void team_with_n_consecutive_wins(int n){
        System.out.println("\nTeam with n consecutive wins and average of filtered team");
        int sum = 0;
        int team_count = 0;
        for (entry key:list){
            int count = 0;
            for(int i=0;i<key.win_loss.length;i++){
                if(key.win_loss[i].equals("win")){
                    count++;
                    if(count==n){
                        System.out.print(key.name+ " ");
                        sum = sum + key.points;
                        team_count++;
                        break;
                    }
                }
                else {
                    count = 0;
                }
                if(count==n){
                    System.out.print(key.name+" ");
                    sum = sum + key.points;
                    team_count++;
                    break;
                }
            }
        }

        System.out.println("\nAverage of filtered team := " + sum/team_count);
    }

    //    Method to get name of team with n consecutive losses and average of filtered team.
    public void team_with_n_consecutive_losses(int n){
        System.out.println("\nTeam with n consecutive losses and average of filtered team");
        int sum = 0;
        int team_count = 0;
        for (entry key:list){
            int count = 0;
            for(int i=0;i<key.win_loss.length;i++){
                if(key.win_loss[i].equals("loss")){
                    count++;
                    if(count==n){
                        System.out.print(key.name+ " ");
                        sum = sum + key.points;
                        team_count++;
                        break;
                    }
                }
                else {
                    count = 0;
                }
                if(count==n){
                    System.out.print(key.name+ " ");
                    sum = sum + key.points;
                    team_count++;
                    break;
                }
            }
        }
        System.out.println("\nAverage of filtered team := " + sum/team_count);
    }

}

public class Main {

    public static void main(String[] args) {
        Indian_pre_League team_data = new Indian_pre_League();
        team_data.put("GT", 20, new String[]{"win","win","loss","loss","win"});

        team_data.put("LSG", 18, new String[]{"win","loss","loss","win","win"});

        team_data.put("RR", 16, new String[]{"win","loss","win","loss","loss"});

        team_data.put("DC", 14, new String[]{"win","win","loss","win","loss"});

        team_data.put("RCB", 14, new String[]{"loss","win","win","loss","loss"});

        team_data.put("KKR", 12, new String[]{"loss","win","win","loss","win"});

        team_data.put("PBKS", 12, new String[]{"loss","win","loss","win","loss"});

        team_data.put("SRH", 12, new String[]{"win","loss","loss","loss","loss"});

        team_data.put("CSK", 8, new String[]{"loss","loss","win","loss","win"});

        team_data.put("MI", 6, new String[]{"loss","win","loss","win","win"});

//        get the data of Team by passing team name.
        team_data.get("MI");

//        get name of team with two consecutive loss.
        team_data.team_with_two_consecutive_loss();

//        get name of team with n consecutive wins and average of filtered team
        team_data.team_with_n_consecutive_wins(2);

//        get name of team with n consecutive losses and average of filtered team.
        team_data.team_with_n_consecutive_losses(3);

    }
}
