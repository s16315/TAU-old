package java.tm.gameRepo;

import java.tm.gameRepo.domain.Game;
import java.util.List;
import java.util.stream.Collector;

public class GamesService {
    private List<Game> gamesList;

    public GamesService(List<Game> gamesList) {
        this.gamesList = gamesList;
    }

    public void addGame(Game game){
        gamesList.add(game);
    }
    public Game GetGameById(int id){
        return gamesList.stream().filter(g -> g.getId() == id).findFirst().orElse(null);
    }
    public Game GetGameByName(String name){
        return gamesList.stream().filter(g -> g.getName().equals(name)).findFirst().orElse(null);
    }

    public void removeGame(Game game){
        gamesList.stream().filter(g -> g.getId() == game.getId()).findFirst().ifPresent(g -> gamesList.remove(g));
    }
    public Boolean updateGame(Game game){
        return true;
    }


}
