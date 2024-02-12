import java.util.*;

class Solution {
    //객체지향 + 자료구조 접근
    public int solution(int[] rank, boolean[] attendance) {
        
        //우선순위 큐 + 정렬 순서를 Student의 rank값으로 오름차순 정렬
        PriorityQueue<Student> pq = new PriorityQueue(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.rank - o2.rank;
            }
        });
        
        for(int i = 0; i < attendance.length; i++) {
            if(attendance[i]) pq.add(new Student(rank[i], i));
        }

        int answer = pq.poll().number * 10000 + pq.poll().number * 100 + pq.poll().number;
        
        return answer;
    }
}

class Student {
    int rank;
    int number;

    public Student(int rank, int number) {
        this.rank = rank;
        this.number = number;
    }
}