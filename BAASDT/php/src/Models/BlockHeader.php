<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Alipaycloud\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BlockHeader extends Model {
    protected $_name = [
        'gasUsed' => 'gas_used',
        'hash' => 'hash',
        'logBloom' => 'log_bloom',
        'number' => 'number',
        'parentHash' => 'parent_hash',
        'receiptRoot' => 'receipt_root',
        'stateRoot' => 'state_root',
        'timestamp' => 'timestamp',
        'transactionRoot' => 'transaction_root',
        'version' => 'version',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->gasUsed) {
            $res['gas_used'] = $this->gasUsed;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->logBloom) {
            $res['log_bloom'] = $this->logBloom;
        }
        if (null !== $this->number) {
            $res['number'] = $this->number;
        }
        if (null !== $this->parentHash) {
            $res['parent_hash'] = $this->parentHash;
        }
        if (null !== $this->receiptRoot) {
            $res['receipt_root'] = $this->receiptRoot;
        }
        if (null !== $this->stateRoot) {
            $res['state_root'] = $this->stateRoot;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->transactionRoot) {
            $res['transaction_root'] = $this->transactionRoot;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BlockHeader
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['gas_used'])){
            $model->gasUsed = $map['gas_used'];
        }
        if(isset($map['hash'])){
            $model->hash = $map['hash'];
        }
        if(isset($map['log_bloom'])){
            $model->logBloom = $map['log_bloom'];
        }
        if(isset($map['number'])){
            $model->number = $map['number'];
        }
        if(isset($map['parent_hash'])){
            $model->parentHash = $map['parent_hash'];
        }
        if(isset($map['receipt_root'])){
            $model->receiptRoot = $map['receipt_root'];
        }
        if(isset($map['state_root'])){
            $model->stateRoot = $map['state_root'];
        }
        if(isset($map['timestamp'])){
            $model->timestamp = $map['timestamp'];
        }
        if(isset($map['transaction_root'])){
            $model->transactionRoot = $map['transaction_root'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        return $model;
    }
    /**
     * @example 12743895
     * @description gas总消耗
     * @var integer
     */
    public $gasUsed;

    /**
     * @example 1344a095ae43e0dbb82e1986a5ab1357a5108d7bf9066f8e52f4b8bf1260a06f
     * @description 十六进制区块哈希值
     * @var string
     */
    public $hash;

    /**
     * @example 000000000000000400000...
     * @description log bloom
     * @var string
     */
    public $logBloom;

    /**
     * @example 1920810
     * @description 区块高度
     * @var integer
     */
    public $number;

    /**
     * @example daf5181a24e6e712988751bd9f808636bd5f291ec7cbef6193198b629d6452b0
     * @description 十六进制区块父hash
     * @var string
     */
    public $parentHash;

    /**
     * @example ac7ec491ed17d6995ce0a919b7be65e431ba4dc9072d485496207e1f83ed5779
     * @description 交易单据树根
     * @var string
     */
    public $receiptRoot;

    /**
     * @example ff0326e45d179e03cd0a077b8cc886935c69b60dde5d7b3961a84bbd4ce4e6be
     * @description 状态树根
     * @var string
     */
    public $stateRoot;

    /**
     * @example 1583202479879
     * @description 区块时间戳
     * @var integer
     */
    public $timestamp;

    /**
     * @example 12c7314185b21e13cd5c873043214a8b51879a82698bc563aa97cb9a36705713
     * @description 十六进制交易merkle树根
     * @var string
     */
    public $transactionRoot;

    /**
     * @example 1125904201810178
     * @description 区块版本
     * @var integer
     */
    public $version;

}