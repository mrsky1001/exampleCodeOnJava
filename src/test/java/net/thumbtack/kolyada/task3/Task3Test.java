package net.thumbtack.kolyada.task3;

import net.thumbtack.kolyada.task2.Task2;
import org.junit.Test;

import static org.junit.Assert.*;


public class Task3Test {
    @Test
    public void main() throws Exception {
        Task3.main(new String[]{"2.5", "5"});
        Task3.main(new String[]{"2", "0"});
        Task3.main(new String[]{"2", "1"});
        Task3.main(new String[]{"0.1", "0"});
    }

}