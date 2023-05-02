package Homework_Java_1;
import java.io.Console;

public class Task02 {
    public static void main(String[] args){
        for(int i = 2; i < 1000; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
              if(i%j==0){
                ++count;
              }
            }
            if(count<2)
               System.out.printf("%s, ", i );
          }
                  }    
}
