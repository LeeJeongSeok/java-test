package me.jeongseok.javatest;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
                (1)
              ↙     ↘
           (2)        (3)
         ↙    ↘     ↙
     (4)      (5) (6)

*/

public class NodeTest {

    @Test
    @DisplayName("1 ~ 6까지의 노드 생성")
    void setUp() {
        Node node6 = new Node(null, 6, null);
        Node node5 = new Node(null, 5, null);
        Node node4 = new Node(null, 4, null);

        Node node3 = new Node(node6, 3, null);
        Node node2 = new Node(node4, 2, node5);

        Node node1 = new Node(node2, 1, node3);
    }

    @Test
    @DisplayName("노드의 child value값 확인")
    void check_value_in_child_node() {
        Node node6 = new Node(null, 6, null);
        Node node5 = new Node(null, 5, null);
        Node node4 = new Node(null, 4, null);

        Node node3 = new Node(node6, 3, null);
        Node node2 = new Node(node4, 2, node5);

        Node node1 = new Node(node2, 1, node3);

        // Node1의 child node value 확인
        assertEquals(2, node1.getLeft().getValue());
        assertEquals(3, node1.getRight().getValue());


        assertEquals(4, node2.getLeft().getValue());
        assertEquals(5, node2.getRight().getValue());

        assertEquals(6, node3.getLeft().getValue());
    }

}
