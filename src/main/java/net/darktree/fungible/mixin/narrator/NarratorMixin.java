package net.darktree.fungible.mixin.narrator;

import com.mojang.text2speech.Narrator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = Narrator.class, remap = false)
public interface NarratorMixin {

	/**
	 * @author magistermaks
	 * @reason Narratorn't
	 */
	@Overwrite
	static Narrator getNarrator() {
		return Narrator.EMPTY;
	}

}
