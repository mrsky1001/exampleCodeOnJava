package net.thumbtack.kolyada.task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task4Test {
    @Test
    public void main() throws Exception {
        Task4.main(new String[]{"1", "1", "3", "4", "2", "2"});
        Task4.main(new String[]{"1", "1", "3", "4", "2", "5"});
        Task4.main(new String[]{"1", "1", "1", "4", "2", "5"});
        Task4.main(new String[]{"4", "4", "7", "1", "5", "3"});
        Task4.main(new String[]{"4", "4", "7", "1", "2", "5"});
        Task4.main(new String[]{"s", "4", "7", "1", "2", "5"});
    }
}