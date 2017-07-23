package net.thumbtack.kolyada.task2;

import net.thumbtack.kolyada.task1.Task1;
import org.junit.Test;

import static org.junit.Assert.*;


public class Task2Test {
    @Test
    public void main() throws Exception {
        Task2.main(new String[]{"2.5", "5"});
        Task2.main(new String[]{"2", "0"});
        Task2.main(new String[]{"2", "1"});
        Task2.main(new String[]{"0.1", "0"});
    }
}