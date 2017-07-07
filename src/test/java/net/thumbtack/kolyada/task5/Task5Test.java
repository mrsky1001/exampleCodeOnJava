package net.thumbtack.kolyada.task5;

import net.thumbtack.kolyada.task4.Task4;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task5Test {
    @Test
    public void main() throws Exception {
        Task5.main(new String[]{"1", "2", "3", "4", "5", "6"});
        Task5.main(new String[]{"1", "1", "1", "1", "1", "1"});
        Task5.main(new String[]{"0", "2", "3", "42", "5", "6"});
        Task5.main(new String[]{"1", "2", "3", "65656564", "5", "66"});
    }

}