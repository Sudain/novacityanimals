package io.github.sudain;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class AnimalsCommand implements Listener, CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        if(!(label.equalsIgnoreCase("novacityanimals")|| label.equalsIgnoreCase("nca"))){
            sender.sendMessage(color("&cIncorrect usage. Try /novacityanimals reload"));
            return true;
        }
        try{
            if(!(args[0].equals("reload"))) {
                sender.sendMessage(color("&cIncorrect usage. Try /novacityanimals reload"));
                return true;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            sender.sendMessage(color("&cIncorrect usage. Try /novacityanimals reload"));
            return true;
        }
        if(sender instanceof Player){
            Player player = (Player)sender;
            if(!(player.isOp() || player.hasPermission("novacity.novacityanimals.admin"))){
                player.sendMessage(color("&4You do not have permission to execute this command."));
                return true;
            }

        }
        Reload();
        sender.sendMessage(color(reloadmsg));
        return true;
    }

    private static String reloadmsg;
    public static void Reload(){
        NovaCityAnimals.getInstance().reloadConfig();
        reloadmsg = NovaCityAnimals.getInstance().getConfig().getString("Messages.reload");
    }

    public String color(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }

}
