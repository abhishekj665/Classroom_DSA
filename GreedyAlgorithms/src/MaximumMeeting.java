import java.util.*;

public class MaximumMeeting {

    /*
    Problem Statement - Given one meeting room and N meetings represented by two arrays, start and end, where start[i] represents the start time of the ith meeting and end[i] represents the end time of the ith meeting, determine the maximum number of meetings that can be accommodated in the meeting room if only one meeting can be held at a time.
     */



    public static int maxMeeting(int[] start, int[] end){
        List<int[]> meetings = new ArrayList<>();

        for(int i = 0; i < start.length; i++){
            meetings.add(new int[]{start[i], end[i], i + 1});
        }

        meetings.sort((a, b) -> {
            if (a[1] == b[1])
                return a[0] - b[0];
            return a[1] - b[1];
        });

        List<Integer> result = new ArrayList<>();

        int lastTime = -1;
        int count = 0;

        for(int[] meet : meetings){
            if(meet[0] > lastTime){
                result.add(meet[2]);
                count++;
                lastTime = meet[1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] start = {5, 1, 3, 10, 2, 5, 4, 7, 2, 2};
        int[] end = {10, 10, 9, 12, 10, 8, 4, 11, 10, 7};

        System.out.println(maxMeeting(start, end));
    }
}
