package task.collection;

import java.util.Objects;

public class Task {
  int id;
  String title;
  boolean isCompleted;

  public Task(int id, String title, boolean isCompleted) {
    this.id = id;
    this.isCompleted = isCompleted;
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Task task = (Task) o;
    return id == task.id && isCompleted == task.isCompleted && Objects.equals(title, task.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, isCompleted);
  }
}