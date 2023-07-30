package com.fire4bird.oz.socket.controller;

import com.fire4bird.oz.common.CMRespDto;
import com.fire4bird.oz.socket.dto.SocketCreateDto;
import com.fire4bird.oz.socket.service.SocketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/socket")
public class SocketController {

    private final SocketService socketService;

    //todo 예시 코드
    @PostMapping
    public ResponseEntity createRoom(@RequestParam String rtcSession) {
        String teamName = "불사조";
        SocketCreateDto socketRoom = socketService.createRoom(rtcSession,teamName);

        return new ResponseEntity<>(new CMRespDto<>(1,"웹소켓 방 생성", socketRoom), HttpStatus.OK);
    }

}