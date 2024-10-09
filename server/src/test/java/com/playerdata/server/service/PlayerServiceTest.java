package com.playerdata.server.service;

import com.playerdata.server.model.Player;
import com.playerdata.server.repository.PlayerRepository;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class PlayerServiceTest {
    @Mock
    private PlayerRepository playerRepository;

    @InjectMocks
    private PlayerServiceImpl playerService;

    // To initialise mocks Before the tests
    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindAllPlayers_whenListContainsPlayers_shouldReturnCorrectPlayerList() {
        Player player1 = new Player(1L, "Fredrik", "Karlsson", "Stockholm", LocalDate.of(1999, 3, 20));
        Player player2 = new Player(2L, "Emma", "Persson", "Uppsala", LocalDate.of(1989, 12, 14));
        List<Player> mockPlayers = Arrays.asList(player1, player2);

        when(playerRepository.findAll()).thenReturn(mockPlayers);

        List<Player> listResult = playerService.findAllPlayers();

        assertEquals(2, listResult.size());
        assertEquals("Fredrik", listResult.get(0).getFirst_name());
        assertEquals("Emma", listResult.get(1).getFirst_name());

        System.out.println("Mock List:");
        for(Player player : listResult) {
            System.out.println(player);
        }
    }
}
