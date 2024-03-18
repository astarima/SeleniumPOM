package Pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".new-todo")
    private WebElement newTodo;

    @FindBy(css = ".view")
    private WebElement todo;

    @FindBy(css = ".view>label")
    private List<WebElement> todos;
    @FindBy(css = ".toggle")
    private List<WebElement> completeTodo;
    @FindBy(css = ".completed ")
    private WebElement completeOne;
    @FindBy(css = ".toggle-all")
    private WebElement completeAll;
    @FindBy(css = ".destroy")
    private List<WebElement> deleteTodoText;
    @FindBy(css = ".clear-completed")
    private List<WebElement> clearBtn;
    @FindBy(css = ".todo-count strong")
    private WebElement leftTodos;
    //    @FindBy(css = ".ember-view")
    @FindBy(css = "[href*='active']")
    private WebElement activeTodosLink;
    //    @FindBy(css = "a[href='/examples/emberjs/todomvc/dist/completed']")
    @FindBy(css = "[href*='completed']")
    private WebElement completedTodosLink;


    public void addTodoText(String... todos) {
        for (String todo : todos) {
            newTodo.sendKeys(todo + Keys.ENTER);
        }

    }

    public String getTodoText() {
        return todo.getText();
    }

    public String getTodoText(int number) {
        return todos.get(--number).getText();
    }

    public void clickCompleteTodo(int number) {
        completeTodo.get(--number).click();
    }

    public void clickCompleteAll() {
        completeAll.click();
    }

    public void clickDeleteTodoText(int i) {
        Actions action = new Actions(driver);
        action.moveToElement(todos.get(i - 1)).perform();
        deleteTodoText.get(i - 1).click();
    }

    public boolean isSuccessMessageDisplayed() {
        return todos.isEmpty();
    }

    public void clickClearBtn() {
        clearBtn.get(0).click();
    }

    public int getTodosCount() {
        return completeTodo.size();
    }

    public String getLeftTodos() {
        return leftTodos.getText();
    }

    public void clickActiveTodosLink() {
        activeTodosLink.click();
    }

    public void clickCompletedTodosLink() {
        completedTodosLink.click();
    }

    public String getWhatTodoText() {
        return newTodo.getAttribute("placeholder");
    }

    public boolean isActiveTodoDisplayed() {
        return completeTodo.isEmpty();
    }
    public boolean isClearBtnDisplayed() {
        return clearBtn.isEmpty();
    }
}







