package dev.bmac.intellij

import com.intellij.ui.IconManager
import com.intellij.util.xml.DomFileDescription
import javax.swing.Icon

class TestDomFileDescription : DomFileDescription<TestElement>(TestElement::class.java, "test") {
    override fun getFileIcon(flags: Int): Icon {
        return IconManager.getInstance().getIcon("icons/test.svg", TestDomFileDescription::class.java)
    }
}