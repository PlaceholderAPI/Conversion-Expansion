package net.cjservers.conversionexpansion;

import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;

public class ConversionExpansion extends PlaceholderExpansion {
  
  @Override
  public @NotNull String getIdentifier() {
    return "conversion";
  }
  
  @Override
  public @NotNull String getAuthor() {
    return "cj89898";
  }
  
  @Override
  public @NotNull String getVersion() {
    return "1.0.0";
  }
  
  @Override
  public String onRequest(OfflinePlayer player, String params) {
    params = PlaceholderAPI.setBracketPlaceholders(player, params);
    String[] split = params.split("_");
    String bases = split[0];
    int base1 = Integer.parseInt(bases.split(":")[0]);
    int base2 = Integer.parseInt(bases.split(":")[1]);
    return Integer.toString(Integer.parseInt(split[1], base1), base2);
  }
  
}
