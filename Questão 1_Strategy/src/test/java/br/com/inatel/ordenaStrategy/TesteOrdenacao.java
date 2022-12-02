package br.com.inatel.ordenaStrategy;
import br.com.inatel.ordenaStrategy.ordena.impl.Bubble;
import br.com.inatel.ordenaStrategy.ordena.impl.Insertion;
import br.com.inatel.ordenaStrategy.ordena.impl.Selection;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TesteOrdenacao {

    SelecionadorDeOrdenacao selecionadorDeOrdenacao;
    ArrayList<Integer> unsortedList = new ArrayList<>();
    ArrayList<Integer> sortedList = new ArrayList<>();

    @Before
    public void init(){
        unsortedList.add(6);
        unsortedList.add(5);
        unsortedList.add(2);
        unsortedList.add(12);
        unsortedList.add(18);
        unsortedList.add(120);
        unsortedList.add(-7);
        unsortedList.add(-80);

        sortedList.add(-80);
        sortedList.add(-7);
        sortedList.add(2);
        sortedList.add(5);
        sortedList.add(6);
        sortedList.add(12);
        sortedList.add(18);
        sortedList.add(120);
    }

    @Test
    public void testBubbleSort(){
        selecionadorDeOrdenacao = new BubbleSort();

        ArrayList<Integer> newSortedList = selecionadorDeOrdenacao.sortList(unsortedList);

        assertTrue(selecionadorDeOrdenacao.getOrdenador() instanceof Bubble);
        assertEquals(newSortedList, sortedList);
    }

    @Test
    public void testSelectionSort(){
        selecionadorDeOrdenacao = new SelectionSort();

        ArrayList<Integer> newSortedList = selecionadorDeOrdenacao.sortList(unsortedList);

        assertTrue(selecionadorDeOrdenacao.getOrdenador() instanceof Selection);
        assertEquals(newSortedList, sortedList);
    }

    @Test
    public void testInsertionSort(){
        selecionadorDeOrdenacao = new InsertionSort();

        ArrayList<Integer> newSortedList = selecionadorDeOrdenacao.sortList(unsortedList);

        assertTrue(selecionadorDeOrdenacao.getOrdenador() instanceof Insertion);
        assertEquals(newSortedList, sortedList);
    }

    @Test
    public void testChangingTheSortType() {
        selecionadorDeOrdenacao = new BubbleSort();

        selecionadorDeOrdenacao = new SelectionSort();
        assertTrue(selecionadorDeOrdenacao.getOrdenador() instanceof Selection);
    }

}
