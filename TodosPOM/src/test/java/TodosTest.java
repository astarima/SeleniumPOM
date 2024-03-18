import Pages.HomePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TodosTest extends BaseTest {
    HomePage homePage;

    @Test
    void addOne() {
        homePage = new HomePage(driver);
        String todoText = "nueiti i muge";
        homePage.addTodoText(todoText);
        assertEquals(todoText, homePage.getTodoText(), "Nera Teksto");
    }

    @Test
    void addThree() {
        homePage = new HomePage(driver);
        String todoText1 = "nueiti i muge";
        String todoText2 = "susirasti darba";
        String todoText3 = "nueiti i kina";
        homePage.addTodoText(todoText1, todoText2, todoText3);
        assertEquals(todoText1, homePage.getTodoText(1), "Nera Teksto");
        assertEquals(todoText2, homePage.getTodoText(2), "Nera Teksto");
        assertEquals(todoText3, homePage.getTodoText(3), "Nera Teksto");

    }

    @Test
    void completedTodo() {
        homePage = new HomePage(driver);
        String todoText1 = "nueiti i muge";
        String todoText2 = "susirasti darba";
        String todoText3 = "nueiti i kina";
        homePage.addTodoText(todoText1, todoText2, todoText3);
        homePage.clickCompleteTodo(1);
        assertEquals("nueiti i muge", homePage.getTodoText(), "Not completed");
    }

    @Test
    void completedAll() {
        homePage = new HomePage(driver);
        String todoText1 = "nueiti i muge";
        String todoText2 = "susirasti darba";
        String todoText3 = "nueiti i kina";
        homePage.addTodoText(todoText1, todoText2, todoText3);
        homePage.clickCompleteAll();
        assertEquals(todoText1, homePage.getTodoText(1), "Not completed");
        assertEquals(todoText2, homePage.getTodoText(2), "Not completed");
        assertEquals(todoText3, homePage.getTodoText(3), "Not completed");
    }

    @Test
    void deleteTodo() {
        homePage = new HomePage(driver);
        String todoText = "nueiti i kina";
        homePage.addTodoText(todoText);
        homePage.clickDeleteTodoText(1);
        boolean isTodoEmpty = homePage.isSuccessMessageDisplayed();
        assertTrue(isTodoEmpty);
    }

    @Test
    void clearCompleted() {
        homePage = new HomePage(driver);
        String todoText1 = "nueiti i muge";
        String todoText2 = "susirasti darba";
        String todoText3 = "nueiti i kina";
        homePage.addTodoText(todoText1, todoText2, todoText3);
        homePage.clickCompleteTodo(2);
        homePage.clickClearBtn();
        assertEquals(2, homePage.getTodosCount());
        assertEquals(todoText1, homePage.getTodoText(1), "Nera Teksto");
        assertEquals(todoText3, homePage.getTodoText(2), "Nera Teksto");

    }

    @Test
    void howManyTodoLeft() {
        homePage = new HomePage(driver);
        String todoText1 = "nueiti i muge";
        String todoText2 = "susirasti darba";
        homePage.addTodoText(todoText1, todoText2);
        assertEquals("2", homePage.getLeftTodos());
        homePage.clickCompleteTodo(1);
        assertEquals("1", homePage.getLeftTodos());
        homePage.clickDeleteTodoText(2);
        assertEquals("0", homePage.getLeftTodos());
    }

    @Test
    void todosFilters() {
        homePage = new HomePage(driver);
        String todoText1 = "nueiti i muge";
        String todoText2 = "susirasti darba";
        String todoText3 = "nueiti i kina";
        homePage.addTodoText(todoText1, todoText2, todoText3);
        homePage.clickActiveTodosLink();
        assertEquals(3, homePage.getTodosCount());
        homePage.clickCompleteTodo(2);
        assertEquals(todoText1, homePage.getTodoText(1), "Nera Teksto");
        assertEquals(todoText3, homePage.getTodoText(2), "Nera Teksto");
        homePage.clickCompletedTodosLink();
        assertEquals(todoText2, homePage.getTodoText(1), "Nera Teksto");
    }
    @Test
    void todoListIsEmpty() {
        homePage = new HomePage(driver);
        assertEquals(0, homePage.getTodosCount());
    }
    @Test
    void whatTodoPlaceholder() {
        homePage = new HomePage(driver);
        String expHolder = "What needs to be done?";
        assertEquals(expHolder, homePage.getWhatTodoText(), "Nera Teksto");
    }
    @Test
    void activeNotActiveTodo() {
        homePage = new HomePage(driver);
        String todoText = "Geros dienos";
        homePage.addTodoText(todoText);
        homePage.clickCompleteTodo(1);
        homePage.clickCompleteTodo(1);
        assertEquals("1", homePage.getLeftTodos());
        boolean isCompleteTodoEmpty = homePage.isActiveTodoDisplayed();
        assertFalse(isCompleteTodoEmpty);


    }
    @Test
    void clearBtn() {
        homePage = new HomePage(driver);
        String todoText = "Geros dienos";
        homePage.addTodoText(todoText);
        assertTrue(homePage.isClearBtnDisplayed());
        homePage.clickCompleteTodo(1);
        assertFalse(homePage.isClearBtnDisplayed());
    }
}




