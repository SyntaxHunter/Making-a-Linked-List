import static org.junit.Assert.*;
import org.junit.Test;

public class ListTest {

	 @Test
	    public void testNewLinkedList(){
	        LinkedList singly = new LinkedList();
	        assertTrue(singly.isEmpty());       // linked list should be empty
	        assertEquals(0, singly.size());   // length of linked list should be zero
	        singly.addLast("ABC");
	        assertFalse(singly.isEmpty());     // linked list should not be empty
	        assertEquals(1, singly.size());  // length of linked list should be 1
	    }
	 
	 @Test
	    public void tesLinkedListAdd(){
	        LinkedList singly = new LinkedList();
	        singly.addLast("You ");
	        singly.addLast("are ");
	        singly.addLast("awesome!!");
	        assertFalse(singly.isEmpty());     // linked list should not be empty
	        assertEquals("You are awesome!!", singly.toString());  // length of linked list should be 1
	    }

}
