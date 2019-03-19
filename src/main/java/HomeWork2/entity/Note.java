package HomeWork2.entity;

import java.util.Date;
import java.util.Objects;

public class Note {
    private String text;
    private Date date;
    private NoteType noteType;

    public Note(String text, Date date, NoteType noteType) {
        if ((text == null) || (date == null) || (noteType == null)) {
            throw new RuntimeException("object fields are null");
        }
        this.text = text;
        this.date = date;
        this.noteType = noteType;
    }

    @Override
    public String toString() {
        return "[" + date + "]" + " [" + NoteType.getRusName(noteType) + "]" + " ["  + text + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return text.equals(note.text) &&
                date.equals(note.date) &&
                noteType == note.noteType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, date, noteType);
    }
}
