public class StudentGrades {
    public int[] scores;
    public void calculateAverage(int[] scores){
            if (scores==null){
                throw new IllegalArgumentException("Score array is null! ");
            }else if (scores.length==0) {
                throw new IllegalArgumentException("Scores array cannot be empty! ");
            }
            for (int score : scores) {//check value in array
                if (score< 0) {//score collect the value of scores==> score=scores[i]
                    throw new IllegalArgumentException("Score cannot be less than 0. ");
                }else if(score>100){
                    throw new IllegalArgumentException("Score cannot be greater than 100.");
                }
            }
            int sum=0;
            for(int score:scores){
                 sum+=score;
            }
            double avgSc=(double) sum/scores.length;
            if(avgSc<40){
                throw new FailedSignificantlyException("Student average is "+avgSc+" ,which is a significant failure.");
            }else {
                System.out.println("Average scores is "+avgSc);
            }

    }
}
