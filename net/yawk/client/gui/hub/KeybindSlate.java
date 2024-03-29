package net.yawk.client.gui.hub;

import java.io.IOException;

import net.yawk.client.Client;
import net.yawk.client.gui.components.TextField;
import net.yawk.client.gui.components.buttons.PluginDownloadButton;
import net.yawk.client.gui.components.buttons.TextButton;
import net.yawk.client.gui.components.scrolling.ModScrollPane;
import net.yawk.client.gui.components.scrolling.PluginScrollPane;
import net.yawk.client.gui.components.scrolling.ScrollPane;
import net.yawk.client.gui.components.selectors.KeybindButton;
import net.yawk.client.gui.components.selectors.SelectorButton;
import net.yawk.client.gui.components.selectors.SelectorSystem;
import net.yawk.client.modmanager.Mod;

public class KeybindSlate extends ComponentSlate{

	public KeybindSlate(GuiHub hub, Client client) {
		super("Keybinds", hub, client);
	}

	@Override
	public void init() {
		
		SelectorSystem<KeybindButton> system = new SelectorSystem<KeybindButton>();
		
		KeybindSetButton setButton = new KeybindSetButton(options, system);
		
		ModScrollPane pane;
		options.addComponent(pane = new ModScrollPane(options, 200, system));
		
		options.addComponent(new TextField(options, "Search"));
		options.addComponent(setButton);
	}

	@Override
	public void keyTyped(char c, int key) throws IOException {
		options.keyPress(c, key);
	}

}
