package com.andrewbrookins.idea.wrap

import com.intellij.openapi.actionSystem.ActionPlaces
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.editor.actionSystem.EditorAction


class WrapParagraphAction : EditorAction(ParagraphWrapHandler(false)) {

    override fun update(e: AnActionEvent) {
        super.update(e)
        if (ActionPlaces.isPopupPlace(e.place)) {
            e.presentation.isVisible = e.presentation.isEnabled
        }
    }

}


class WrapParagraphAtCaretAction : EditorAction(ParagraphWrapHandler(true)) {

    override fun update(e: AnActionEvent) {
        super.update(e)
        if (ActionPlaces.isPopupPlace(e.place)) {
            e.presentation.isVisible = e.presentation.isEnabled
        }
    }

}
