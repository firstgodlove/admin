package com.mojian.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.mojian.utils.DateUtils;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.time.LocalDateTime;
import java.io.Serializable;

@Data
@TableName("sys_album")
@Schema(description = "相册对象")
public class SysAlbum implements Serializable {

    @TableId(type = IdType.AUTO)
    @Schema(description = "主键")
    private Long id;

    @Schema(description = "封面图")
    private String cover;

    @Schema(description = "相册名")
    private String name;

    @Schema(description = "相册描述")
    private String description;

    @Schema(description = "是否加密 0：否 1：是")
    private Integer isLock;

    @Schema(description = "密码")
    private String password;

    @Schema(description = "排序")
    private Integer sort;

    @Schema(description = "创建时间")
    @JsonFormat(pattern = DateUtils.YYYY_MM_DD, timezone = "GMT+8")
    private LocalDateTime createTime;


    @TableField(exist = false)
    private Integer photoNum;
}
