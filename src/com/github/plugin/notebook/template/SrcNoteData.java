package com.github.plugin.notebook.template;

import com.github.aaaaa.notebook.NoteData;

import java.util.List;

public interface SrcNoteData {
    String getFileName();
    List<NoteData> getNoteList();
    String getTopic();
}
