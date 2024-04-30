import java.util.ArrayList;
import java.util.HashSet;

class main2 {

        public static void main(String[] args) {
            String text="Data science is the study of data to extract meaningful insights for business. \n" +
                    "It is a multidisciplinary approach that combines principles and practices from the fields of mathematics, statistics, artificial intelligence, and computer engineering to analyze large amounts of data. \n" +
                    " This analysis helps data scientists to ask and answer questions like what happened, why it happened, what will happen, and what can be done with the results. ";
            ArrayList<String> words=new ArrayList<>();

            String t[]=text.split(" ");
            String t1[]=text.split("\\. ");
            System.out.println("Total characters : " +text.length());
            for(String temp:t) {
                words.add(temp);
            }
            HashSet<String>set=new HashSet<>();
            set.addAll(words);
            System.out.println("Unique words : "+set.size());

            ArrayList<word>w1=new ArrayList<>();
            for(String temp:t1){
                //w1.add(new word(temp,1));
                if(w1.contains(new word(temp,0))){
                    int i=w1.indexOf(new word(temp,0));
                    w1.get(i).setCount(w1.get(i).getCount()+1);
                    System.out.println();

                }
                else{
                    w1.add(new word(temp,1));
                }
            }

            System.out.println("Total words : "+words.size());

            System.out.println("Total sentences : "+t1.length);

        }
    }

