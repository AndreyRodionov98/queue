import java.util.*;

public class Main {

    private static final List<String> NAMES= List.of(
            "Иван Иванов",
            "Петр Петров",
            "Валентин Грибнов",
            "Кирилл Филимоннов",
            "Демид Сидоров",
            "Петр Толстых",
            "Алексей Сурков",
            "Сергей Чирков",
            "Виталий Горин",
            "Дмитрий Михайлов"
    );
    private static final Random RANDOM=new Random();
    private static final int MAX_SIZE =5;

    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        System.out.println("в первую очередь: " + queue1);
        System.out.println("во вторую очередь: " + queue2);
        add("Петр Иванов", queue1, queue2);

        example();
    }
            private static void add(String name,Queue<String>queue1,Queue<String>queue2){
                if (queue1.size()< queue2.size()&&queue1.size()!=MAX_SIZE){
                    queue1.add(name);
                }
                else if (queue2.size()< queue1.size()&&queue2.size()!=MAX_SIZE){
                    queue2.add(name);
                }else {
                    System.out.println("Необходимо позвать Галю");
                }

            }

            private static void randomFilling(Queue<String>queue){
                int size=RANDOM.nextInt(MAX_SIZE + 1);
                for (int i = 0; i < size; i++) {
                    queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));

                }
            }


    private static void  example() {
        List<List<String>> biDemArrList = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, (i + j) % 2 ==1?"●": "◯");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
        }

