package pack00gof.pack00behavioral.example00memento;

// Memento
public class DocumentMemento {
  private String content;

  public DocumentMemento(String content) {
    this.content = content;
  }

  public String getSavedContent() {
    return this.content;
  }
}
