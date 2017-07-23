package net.thumbtack.kolyada.task6;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task6Test {
    @Test
    public void main() throws Exception {
        Task6.main(new String[]{"1", "2", "3", "4", "5", "6"});
        Task6.main(new String[]{"8", "6", "5", "4", "1", "0"});
        Task6.main(new String[]{"1", "4", "3", "1", "5", "6"});
    }

}